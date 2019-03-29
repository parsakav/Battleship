
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public final class Main {
    
    public final String DEFAULT_TAG = "-";
    public final String TRUE_TAG = "*";
    public final String FALSE_TAG = "#";
    private final ArrayList<Integer> Keshti = new ArrayList<>();
    int eshtebah = 0;
    private final ArrayList<Integer> Find = new ArrayList<>();
    private final ArrayList<String> DisplayMatris = new ArrayList<>();
    
    public Main() {
        init();
        Display("print");
        String[] in = GetUserInput();
        Compute(in);
    }
    
    public void init() {
        for (int i = 0; i <= 100; i++) {
            DisplayMatris.add("- ");
        }
        RandomWorks();
    }
    
    private void RandomWorks() {
        Random random = new Random();
        try {
            Keshti.get(3);
        } catch (Exception e) {
            int count = 0;
            while (count <= 1) {
                int num = random.nextInt(100);
                if (!Keshti.contains(num)) {
                    int rand = random.nextInt(2);
                    if (rand == 1 && num <= 99) {
                        if (!Keshti.contains(num + 1)) {
                            count++;
                            Keshti.add(num);
                            Keshti.add(num + 1);
                        } else {
                            RandomWorks();
                        }
                    } else if (rand == 0 && num < 91) {
                        if (!Keshti.contains(num + 10)) {
                            
                            count++;
                            Keshti.add(num);
                            Keshti.add(num + 10);
                            
                        } else {
                            RandomWorks();
                        }
                    } else {
                        
                        RandomWorks();
                    }
                } else {
                    
                    RandomWorks();
                }
            }
        }
        
        try {
            Keshti.get(11);
        } catch (Exception e) {
            int count = 0;
            while (count <= 1) {
                int num = random.nextInt(100);
                if (!Keshti.contains(num)) {
                    int rand = random.nextInt(2);
                    if (rand == 1 && num <= 97) {
                        if (!Keshti.contains(num + 1) && !Keshti.contains(num + 2) && !Keshti.contains(num + 3)) {
                            
                            Keshti.add(num);
                            Keshti.add(num + 1);
                            Keshti.add(num + 2);
                            Keshti.add(num + 3);
                            count++;
                        } else {
                            
                            RandomWorks();
                        }
                    } else if (rand == 0 && num <= 70) {
                        if (!Keshti.contains(num + 10) && !Keshti.contains(num + 20) && !Keshti.contains(num + 30)) {
                            Keshti.add(num);
                            Keshti.add(num + 10);
                            Keshti.add(num + 20);
                            Keshti.add(num + 30);
                            count++;
                        } else {
                            RandomWorks();
                        }
                    } else {
                        RandomWorks();
                    }
                } else {
                    RandomWorks();
                }
            }
        }
        try {
            Keshti.get(16);
        } catch (Exception e) {
            int num = random.nextInt(100);
            if (!Keshti.contains(num)) {
                int rand = random.nextInt(2);
                if (rand == 1 && num <= 96) {
                    if (!Keshti.contains(num + 1) && !Keshti.contains(num + 2) && !Keshti.contains(num + 3) && !Keshti.contains(num + 4)) {
                        
                        Keshti.add(num);
                        Keshti.add(num + 1);
                        Keshti.add(num + 2);
                        Keshti.add(num + 3);
                        Keshti.add(num + 4);
                        System.out.println("first" + Keshti);
                    } else {
                        
                        RandomWorks();
                    }
                    
                } else if (rand == 0 && num <= 60) {
                    if (!Keshti.contains(num + 10) && !Keshti.contains(num + 20) && !Keshti.contains(num + 30) && !Keshti.contains(num + 40)) {
                        
                        Keshti.add(num);
                        Keshti.add(num + 10);
                        Keshti.add(num + 20);
                        Keshti.add(num + 30);
                        Keshti.add(num + 40);
                        System.out.println("sec" + Keshti);
                    } else {
                        RandomWorks();
                    }
                } else {
                    
                    RandomWorks();
                }
            } else {
                RandomWorks();
            }
        }
    }
    
    public void Display(String status) {
        if (status.equals("print")) {
            int outputcounter = 0;
            while (outputcounter <= 100) {
                for (int i = 0; i < 10; i++) {
                    System.out.print(DEFAULT_TAG + " ");
                    if (i == 9) {
                        outputcounter = outputcounter + 10;
                        System.out.println("");
                    }
                }
            }
            String[] userinput = GetUserInput();
            Compute(userinput);
        } else {
            
            for (int i = 0; i < 100; i++) {
                if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60 || i == 70 || i == 80 || i == 90 || i == 100) {
                    System.out.println("\n");
                }
                System.out.print(DisplayMatris.get(i) + " ");    
            }
            
        }
    }
    
    public String[] GetUserInput() {
        if (Find.size() == 16) {
            System.out.println("Game Wone! : Eshteb : " + eshtebah);
            System.exit(0);
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.println("\n Please Enter X: ");
            String X = scan.nextLine();
            System.out.println("\n Please Enter Y: ");
            String Y = scan.nextLine();
            if (X.isEmpty() || Y.isEmpty()) {
                System.err.println("Error : X Or Y Is Empty!");
                GetUserInput();
            } else {
                String m = Y + X;
                String[] ret = {X, m};
                return ret;
            }
        }
        return null;
    }
    
    private void Compute(String[] UserInput) {
        String s = DisplayMatris.get(Integer.parseInt(UserInput[1]));
        switch (s) {
            case "*":
                System.err.println("Error..try again");
                GetUserInput();
                break;
            case "#":
                System.err.println("Error..try again");
                GetUserInput();
                break;
            default:
                if (Keshti.contains(Integer.parseInt(UserInput[1]))) {
                    Find.add(1);
                    DisplayMatris.set(Integer.parseInt(UserInput[1]), TRUE_TAG);
                    Display("" + Integer.parseInt(UserInput[1]));
                    Compute(GetUserInput());
                    
                } else {
                    DisplayMatris.remove(Integer.parseInt(UserInput[1]));
                    DisplayMatris.set(Integer.parseInt(UserInput[1]), FALSE_TAG);
                    Display("" + Integer.parseInt(UserInput[1]));
                    Compute(GetUserInput());
                    eshtebah++;
                }
                break;
        }
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
