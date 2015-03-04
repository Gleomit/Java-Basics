public class FullHouse
{
    public static void main(String[] args)
    {
        String[] face = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        char[] suits = {'\u2660','\u2665','\u2666','\u2663'};
        String expression = "";
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
                                        expression = "(" + face[first] + suits[suitOne] + " " + face[first] + suits[suitTwo] + " "
                                                + face[first] + suits[suitThree] + " " + face[second] + suits[suitFour] + " "
                                                + face[second] + suits[suitFive] + ")";
                                        System.out.println(expression);
                                        counter++;         
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("\n%d full houses", counter);
    }
}
