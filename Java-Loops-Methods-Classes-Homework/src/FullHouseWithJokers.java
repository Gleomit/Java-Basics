public class FullHouseWithJokers
{
    public static void main(String[] args)
    {
        String[] face = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        char[] suits = {'\u2660','\u2665','\u2666','\u2663'};
        int counter = 0;
        for (int first = 0; first < face.length; first++)
        {
            for (int second = 0; second < face.length; second++)
            {
                for (int suitOne = 0; suitOne < suits.length; suitOne++)
                {
                    for (int suitTwo = suitOne + 1; suitTwo < suits.length; suitTwo++)
                    {
                        for (int suitThree = suitTwo + 1; suitThree < suits.length; suitThree++)
                        {
                            for (int suitFour = 0; suitFour < suits.length; suitFour++)
                            {
                                for (int suitFive = suitFour + 1; suitFive < suits.length; suitFive++)
                                {
                                    if(!face[first].equals(face[second]) &&
                                            suitOne != suitTwo && suitOne != suitThree
                                            && suitTwo != suitThree && suitFour != suitFive)
                                    {
                                    	String cardOne = face[first] + suits[suitOne];
										String cardTwo = face[first] + suits[suitTwo];
										String cardThree = face[first] + suits[suitThree];
										String cardFour = face[second] + suits[suitFour];
										String cardFive = face[second] + suits[suitFive];
										counter+=32;
										System.out.println("(" + cardOne + " " + cardTwo + " " + cardThree + " " + cardFour + " " + cardFive + ")");
										System.out.println("(* " + cardTwo + " " + cardThree + " " + cardFour + " " + cardFive + ")");
										System.out.println("(" + cardOne + " * " + cardThree + " " + cardFour + " " + cardFive + ")");
										System.out.println("(" + cardOne + " " + cardTwo + " * " + cardFour + " " + cardFive + ")");
										System.out.println("(" + cardOne + " " + cardTwo + " " + cardThree + " * " + cardFive + ")");
										System.out.println("(" + cardOne + " " + cardTwo + " " + cardThree + " " + cardFour + " *)");
										
										System.out.println("(* * " + cardThree + " " + cardFour + " " + cardFive + ")");
										System.out.println("(" + cardOne + " * * "  + cardFour + " " + cardFive + ")");
										System.out.println("(" + cardOne + " " + cardTwo + " * * " + cardFive + ")");
										System.out.println("(" + cardOne + " " + cardTwo + " " + cardThree + " * *)");
										
										System.out.println("(* " + cardTwo + " * " + cardFour + " " + cardFive + ")");
										System.out.println("(* " + cardTwo + " " + cardThree + " * " + cardFive + ")");
										System.out.println("(* " + cardTwo + " " + cardThree + " " + cardFour + " *)");
										System.out.println("(" + cardOne + " * " + cardThree + " " + cardFour + " *)");
										System.out.println("(" + cardOne + " " + cardTwo + " * " + cardFour + " *)");
										System.out.println("(" + cardOne + " * " + cardThree + " * " + cardFive + ")");
										
										System.out.println("(* * * " + cardFour + " " + cardFive + ")");
										System.out.println("(" + cardOne + " * * * "  + cardFive + ")");
										System.out.println("(" + cardOne + " " + cardTwo + " * * *)");
										
										System.out.println("(* " + cardTwo + " * * "  + cardFive + ")");
										System.out.println("(* " + cardTwo + " " + cardThree + " * *)");
										System.out.println("(" + cardOne +  " * " + cardThree + " * *)");
										System.out.println("(* " + cardTwo + " * "  + cardFour + " *)");
										
										System.out.println("(* * " + cardThree + " * "  + cardFive + ")");
										System.out.println("(* * " + cardThree + " " + cardFour+ " *)");
										System.out.println("(" + cardOne + " * * " + cardFour + " *)");
										
										System.out.println("(* * * * " + cardFive + ")");
										System.out.println("(" + cardFive + " * * * *)");
										System.out.println("(* " + cardTwo + " * * *)");
										System.out.println("(* * " + cardThree + " * *)");
										System.out.println("(* * * " + cardFour + " *)");
										System.out.println("(* * * * *)");										
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
	    System.out.printf("%d full houses", counter);
    }
}