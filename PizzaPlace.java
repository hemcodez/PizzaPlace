import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PizzaPlace {

    public String getGreeting() //Create a Greeting Message
    {
        return "> Welcome to Jippi's Pizza Place! (^v^)/";
    }

        public static void main (String[]args){

            //Print Jippi's Greeting and display a question to the user
            PizzaPlace Jippi = new PizzaPlace();
            System.out.println(Jippi.getGreeting());
            System.out.println("> Would you like to create your own pizza?");

            //Create New Scanner Object
            Scanner input = new Scanner(System.in);

            //Get user input from displayed question
            String answer = input.next();

            //Start taking pizza order
            if (answer.equals("yes")) {
                System.out.println("> How many pizzas would you like to create?");

                int pizzaAmount = input.nextInt();

                System.out.println("> Okay " + pizzaAmount + " pizza(s). Let's begin!");

                System.out.println("> What type of crust would you like?");

                    //Create a List of crust
                    List<String> crustList = new ArrayList<String>();
                    crustList.add("1: Thin Crust");
                    crustList.add("2: Stuffed Crust");
                    crustList.add("3: Deep-Dish");
                    crustList.add("4: Cauliflower Crust");

                    //Iterating the list element use for each loop
                    for (String crust : crustList)
                        System.out.println(crust);

                    // loop to get crust for each pizza
                    for (int counterCrust = 1; counterCrust <= pizzaAmount; counterCrust++) {

                        String crustType = input.next();

                        //Display chosen crust for # of pizzas
                        System.out.println("> Pizza " + counterCrust + ": " + crustType + " crust.");
                    }

                    //Ask the user what sauce they want with their pizza(s)
                System.out.println("> What sauce would you like? White, Pepper, Sweet, Or Tomato sauce-based? ");

                    //loop to get sauce type for each pizza
                    for(int counterSauce = 1; counterSauce <= pizzaAmount; counterSauce++){

                        String sauceType = input.next();

                        System.out.println("> Pizza " + counterSauce + ": " + sauceType + " sauce.");
                    }

                    //Start topping process, Display a message asking user to choose toppings
                    System.out.println("> Now for the fun part. Choose your desired toppings~! :D");

                    //Create a loop for pizza toppings
                    for(int counterTopping = 1; counterTopping <= pizzaAmount; counterTopping++) {

                        System.out.println("> You're now choosing toppings for Pizza " + counterTopping);

                        //Create a List of toppings
                        List<String> toppingList = new ArrayList<String>();
                        toppingList.add("1: Pepperoni");
                        toppingList.add("2: Sausage");
                        toppingList.add("3: Cheese");
                        toppingList.add("4: Mushrooms");
                        toppingList.add("5: Olives");
                        toppingList.add("6: Pineapple");
                        toppingList.add("7: Peppers");
                        toppingList.add("8: Parmesan");

                        //Iterating the list element use for each loop
                        for (String pizzaToppings : toppingList)
                            System.out.println(pizzaToppings);

                        //Ask user how many toppings they want
                        int length;
                        System.out.println("> From the list above, How many toppings do you want?");
                        length = input.nextInt();
                        String[] toppings = new String[length];

                        //loop to gather input of users pizza toppings
                        for (int toppingCounter = 0; toppingCounter < length; toppingCounter++) {
                            System.out.println("> Enter topping " + (toppingCounter + 1));
                            toppings[toppingCounter] = input.next();
                        }

                        for (int toppingCounter = 0; toppingCounter < length; toppingCounter++) {
                            System.out.println("> You put " + toppings[toppingCounter] + " on your pizza.");

                        }
                    }

                    System.out.println("> Happy doing pie business with ya! Comeback anytime :)");

            }// end PIZZA CREATION PROCESS

            // If user said they didn't want to create a pizza display this message
            else if (answer.equals("no")){
                System.out.println("> Lame... Comeback whenever you wanna create a pizza.");
            }

            input.close(); //Close Scanner

        } //end main method


    } //end class
