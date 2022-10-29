//*****************************************************************************************
// DalmutiArray.java
// 10/19/2022
// Kirsten Scott
// This program consists of a main method to create and populate an array which
// simulates a Great Dalmuti card deck, a method to simulate shuffling the deck,
// and a method to print each element of the shuffled array by iterating over each
// item.
//*****************************************************************************************


public class DalmutiArray
{
    public static void main (String[] args){
        
        int rank, index = 0;
        String name;
        String[] cardArray = new String[80];
        
        //*********************************************************************************
        // A series of while-loops to populate the cardArray array based on the index
        // range.
        //*********************************************************************************
        while(index == 0){
            rank = 1;
            name = "Dalmuti";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        while(index >= 1 && index <= 2){
            rank = 2;
            name = "Archbishop";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        while(index >= 3 && index <= 5){
            rank = 3;
            name = "Earl Marshal";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        while(index >= 6 && index <= 9){
            rank = 4;
            name = "Baroness";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        while(index >= 10 && index <= 14){
            rank = 5;
            name = "Abbess";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        while(index >= 15 && index <= 20){
            rank = 6;
            name = "Knight";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        while(index >= 21 && index <= 27){
            rank = 7;
            name = "Seamstress";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        while(index >= 28 && index <= 35){
            rank = 8;
            name = "Mason";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        while(index >= 36 && index <= 44){
            rank = 9;
            name = "Cook";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        while(index >= 45 && index <= 54){
            rank = 10;
            name = "Shepherdess";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        while(index >= 55 && index <= 65){
            rank = 11;
            name = "Stonecutter";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        while(index >= 66 && index <= 77){
            rank = 12;
            name = "Peasant";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        while(index >= 78 && index <= 79){
            rank = 13;
            name = "Jester";
            cardArray[index] = (rank + ": " + name);
            index++;
        }
        
        //*********************************************************************************
        // Call the shuffleCards() method.
        //*********************************************************************************
        shuffleCards(cardArray);
        dealCards(cardArray);
    }
    
    //*********************************************************************************
    // A static method that uses a for-loop to shuffle the array, or deck.
    //*********************************************************************************
    public static void shuffleCards(String[] cardArray){
        int num = cardArray.length;
        for (int index = 0; index < num; index++){
            int r = index + (int)(Math.random() * (num-index));
            String temp = cardArray[r];
            cardArray[r] = cardArray[index];
            cardArray[index] = temp;
        }
        
        //*********************************************************************************
        // After the array has been shuffled, call the dealCards() method.
        //*********************************************************************************

    }
    
    //*********************************************************************************
    // A static method that deals cards to four players by iterating over the cardArray
    // index.
    //*********************************************************************************

    public static void dealCards(String[] cardArray){
        System.out.printf("%-18s%-18s%-18s%-18s%n","Player1","Player2","Player3","Player4","\n");
        System.out.println("====================================================================");
        
        //*******************************************************************************
        // Create a counter to track each iteration of the loop.
        //*******************************************************************************
        int rowBreak = 0;
        
        //*********************************************************************************
        // A for-loop to iterate over each item in the array.
        //*********************************************************************************
        for(int index = 0;index<80;index++){
            rowBreak++;
            
            //*******************************************************************************
            // An if-clause for formatting purposes, including a newline character for every
            // fourth iteration of the loop.
            //*******************************************************************************
            if((rowBreak)%4==0)
                System.out.printf("%-18s%n",cardArray[index],"\n");
            else
                System.out.printf("%-18s",cardArray[index]);
        }
    }
}
