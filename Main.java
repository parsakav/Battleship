import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public final class Main {

    public final String DEFAULT_TAG = "-";
    public final String TRUE_TAG = "*";
    public final String FALSE_TAG = "#";
    // کشتی هایی که تصادفی انتخاب شدن رو بریز توی این
    private final ArrayList<Integer> Keshti = new ArrayList<>();

//حرکت هایی که کاربر کرده رو بریز توی این 
    private static int eshtebah = 0;
    // کشتی هایی که کاربر ذخیره کرده رو بریز توی  عدد زیر
    private int Find = 0;
    // ماتریس کلی رو بریز توی این
    private final ArrayList<String> DisplayMatris = new ArrayList<>();
    public Main() {
        // کل ارایه رو مقدار دهی اولیه کن  "-" 

    	  for (int i = 0; i <= 100; i++) {
              DisplayMatris.add(DEFAULT_TAG);
          }
    }

    public void startGame() {
        System.out.println("##################\n" +
"#BATTLE SHIP GAME#\n" +
"##################\n");
      
        // کشتی هارو به صورت تصادفی انتخاب کن
        RandomWorks();
        // مقدار دهی های اولیه رو انجام بده
     
        // پرینت کن کل ماتریس رو 
        Display();
        // از کاربر ورودی و مختصات ماتریس رو بگیر
        String[] in = GetUserInput();
        // مختصات رو بفرس این متد برای محاسبه
        Compute(in);
    }

    
    // کشتی هارو به صورت تصادفی انتخاب کن
   private void RandomWorks() {
	   // با استفاده از کلاس تصادفی 
        Random random = new Random();
        // یادته بالا گفتم کشتی هارو توی ارایه ی کشتی بریز؟
        // اینجا چک میکنیم خونه ی دوم ارایه   رو گت میکنیم
        // اگه خطا رخ داد یعنی خالیه
        // اگر هم نداد میره بعدی هارو چک میکنه تا جایی که هیچ خطایی نده یعنی تمام کشتی ها به صورت درست انتخاب شده باشن
             try {
            Keshti.get(1);
        } catch (Exception e) {
        	//اگه خطا داد پس یعنی  اولین کشتیه دوتایی پر نشده
            // بین صفر تا صد عدد تصادفی بگیر 
        	int num = random.nextInt(100);
        	// این عدد رقم دوم عددی که رندوم بدست اومده هست
                 int is = 0;
                if(num >= 10) {
//آگر بزرگتر از ده یا مساوی ده هست پس یعنی دو رقمیه
                	if( num != 10 && num != 20 && num !=30 && num != 40 && num != 50 && num!=60 && num!=70 && num != 80 && num != 90 )
              
                		
                {
                		// باید عدد تصادفی نامساوی باشه با این بالاییا چون اگه مساوی باشه کشتی میوفته یه خط بعد نصفش هم میوفته خط قبل
                		// عدد رو به رشته تبدیل کن تا بتونیم رقم دومش رو در بیاریم
                		String sub = String.valueOf(num).substring(1);
                is = Integer.parseInt(sub);
                } else {
                	RandomWorks();
                }
                        } else {
                            // اگر عدد تصادفی کوچک تر از ده بود خب خودش یک رقمی هست

                    is = num;
                }
                if (!Keshti.contains(num)) {
             // عدد تصادفی بگیر... اگه صفر بود پس  افقی در نظر بگیر کشتی هارو اگر هم یک بود عمودی
                    int rand = random.nextInt(2);
                    if (rand == 1 && num <= 99) {
                        if (!Keshti.contains(num + 1) && is <=9) {
                            Keshti.add(num);
                            Keshti.add(num + 1);
                        } else {
                            RandomWorks();
                        }
                    } else if (rand == 0 && num < 91) {
                        if (!Keshti.contains(num + 10)) {

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
        try {
            Keshti.get(3);
        } catch (Exception e) {
         
                int num = random.nextInt(100);
                int is = 0;
                if(num >= 10) {
                	if( num != 10 && num != 20 && num !=30 && num != 40 && num != 50 && num!=60 && num!=70 && num != 80 && num != 90 )
              
                {
                		String sub = String.valueOf(num).substring(1);
                is = Integer.parseInt(sub);
                } else {
                	RandomWorks();
                }
                        } else {
                    is = num;
                }
                if (!Keshti.contains(num)) {
             
                    int rand = random.nextInt(2);
                    if (rand == 1 && num <= 99) {
                        if (!Keshti.contains(num + 1) && is <=9) {
                            Keshti.add(num);
                            Keshti.add(num + 1);
                        } else {
                            RandomWorks();
                        }
                    } else if (rand == 0 && num < 91) {
                        if (!Keshti.contains(num + 10)) {

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
try {
            Keshti.get(7);
        } catch (Exception e) {
                int num = random.nextInt(100);
                if (!Keshti.contains(num)) {
                    int is = 0;
                    if(num >= 10) {
                    	if( num != 10 && num != 20 && num !=30 && num != 40 && num != 50 && num!=60 && num!=70 && num != 80 && num != 90 )
                  
                    {
                    		String sub = String.valueOf(num).substring(1);
                    is = Integer.parseInt(sub);
                    } else {
                    	RandomWorks();
                    }
                            } else {
                        is = num;
                    }
                
                    	
                    int rand = random.nextInt(2);
                    if (rand == 1 && num <= 97) {
                        if (is <=7 &&
                                !Keshti.contains(num + 1) && !Keshti.contains(num + 2) && !Keshti.contains(num + 3)) {

                            Keshti.add(num);
                            Keshti.add(num + 1);
                            Keshti.add(num + 2);
                            Keshti.add(num + 3);
                        } else {

                            RandomWorks();
                        }
                    } else if (rand == 0 && num <70) {
                        if (!Keshti.contains(num + 10) && !Keshti.contains(num + 20) && !Keshti.contains(num + 30)) {
                            Keshti.add(num);
                            Keshti.add(num + 10);
                            Keshti.add(num + 20);
                            Keshti.add(num + 30);
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
        try {
            Keshti.get(11);
        } catch (Exception e) {
                int num = random.nextInt(100);
                if (!Keshti.contains(num)) {
                    int is = 0;
                    if(num >= 10) {
                    	if( num != 10 && num != 20 && num !=30 && num != 40 && num != 50 && num!=60 && num!=70 && num != 80 && num != 90 )
                  
                    {
                    		String sub = String.valueOf(num).substring(1);
                    is = Integer.parseInt(sub);
                    } else {
                    	RandomWorks();
                    }
                            } else {
                        is = num;
                    }
                    
                    int rand = random.nextInt(2);
                    if (rand == 1 && num < 97) {
                        if (is <=7 &&
                                !Keshti.contains(num + 1) && !Keshti.contains(num + 2) && !Keshti.contains(num + 3)) {

                            Keshti.add(num);
                            Keshti.add(num + 1);
                            Keshti.add(num + 2);
                            Keshti.add(num + 3);
                        } else {

                            RandomWorks();
                        }
                    } else if (rand == 0 && num <= 70) {
                        if (!Keshti.contains(num + 10) && !Keshti.contains(num + 20) && !Keshti.contains(num + 30)) {
                            Keshti.add(num);
                            Keshti.add(num + 10);
                            Keshti.add(num + 20);
                            Keshti.add(num + 30);
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
        try {
            Keshti.get(16);
        } catch (Exception e) {
            int num = random.nextInt(100);
            if (!Keshti.contains(num)) {
                int is = 0;
                if(num >= 10) {
                	if( num != 10 && num != 20 && num !=30 && num != 40 && num != 50 && num!=60 && num!=70 && num != 80 && num != 90 )
              
                {
                		String sub = String.valueOf(num).substring(1);
                is = Integer.parseInt(sub);
                } else {
                	RandomWorks();
                }
                        } else {
                    is = num;
                }
                int rand = random.nextInt(2);
                if (rand == 1 && num <= 96) {
                    if (!Keshti.contains(num + 1) && !Keshti.contains(num + 2) && !Keshti.contains(num + 3) && !Keshti.contains(num + 4)
                            && is <=6) {

                        Keshti.add(num);
                        Keshti.add(num + 1);
                        Keshti.add(num + 2);
                        Keshti.add(num + 3);
                        Keshti.add(num + 4);
                    } else {

                        RandomWorks();
                    }

                } else if (rand == 0 && num < 60) {
                    if (!Keshti.contains(num + 10) && !Keshti.contains(num + 20) && !Keshti.contains(num + 30) && !Keshti.contains(num + 40)) {

                        Keshti.add(num);
                        Keshti.add(num + 10);
                        Keshti.add(num + 20);
                        Keshti.add(num + 30);
                        Keshti.add(num + 40);
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

    public void Display() {
   


        //  ماتریس رو پرینت کن
        for (int i = 0; i < 100; i++) {
            // ده تا ده تا برو لاین بعد
            if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60 || i == 70 || i == 80 || i == 90) {
                System.out.println("\n");
            }
            System.out.print(DisplayMatris.get(i) + "  ");
        }
    }

    public String[] GetUserInput() {
                System.out.println("\n");

        if (Find == 17) {
            // اگه کشتیایی که انتخاب کرده 16 بود یعنی برده 
            System.out.println("\n"+"شما بردید! حرکات شما : " + eshtebah);
            System.exit(0);
        } else {
            // اگه نبود ورودی بگیر دوباره 
            Scanner scan = new Scanner(System.in);
                        System.out.println("\n Please Enter Y: ");
            String Y = scan.nextLine();
            System.out.println("\n Please Enter X: ");
            String X = scan.nextLine();
             int x ;
            try {
            x    = Integer.parseInt(Y);
            } catch(Exception e) {
                 if (X.isEmpty() || Y.isEmpty() ) {
       
                System.err.println("Error : X Or Y Is Empty!");
               return GetUserInput();
            }
                 else {
                     return GetUserInput();
                 }
            } 

   if (X.isEmpty() || Y.isEmpty() ) {
       
                System.err.println("Error : X Or Y Is Empty!");
               return GetUserInput();
            } else {
                       int y = Integer.parseInt(X);
if(x >10 || y >10 || x<1 || y <1) {
    System.out.println("wrong number!");
   return  null;
    
} else {
                int i = Integer.parseInt(Y) - 1;
                int ib = Integer.parseInt(X) - 1;
                String[] ret = {String.valueOf(i), String.valueOf(i) + String.valueOf(ib)};
                return ret;
}
            }
        }
        return null;
    }

    private void Compute(String[] UserInput) {
    
        try {
            String s = DisplayMatris.get(Integer.parseInt(UserInput[1]));
          
                if(s.contains("*")) {
                    // اگه خونه ای که انتخاب کرده بود این بود یعنی قبلا انتخاب کرده پس ارور بده
                                        System.out.println("این خانه قبلا انتخاب شده است");
                    Compute(GetUserInput());
                }
              if(s.contains("#")) {

                    // اگه خونه ای که انتخاب کرده بود این بود یعنی قبلا انتخاب کرده پس ارور بده
                    System.err.println("این خانه قبلا انتخاب شده است");
                    Compute(GetUserInput());
                             }
              else {

                    // اگه هم انتخاب نکرده بود  و چیزی که انتخاب شده توی کشتی های ما بود یعنی درست گفته دیگه 
                    if (Keshti.contains(Integer.parseInt(UserInput[1]) + 1)) {
                        Find = Find + 1;
                        DisplayMatris.set(Integer.parseInt(UserInput[1]), TRUE_TAG);
                        Display();
                        eshtebah = eshtebah + 1;
                        Compute(GetUserInput());
                    } else {

                        DisplayMatris.set(Integer.parseInt(UserInput[1]), FALSE_TAG);
                        Display();
                        eshtebah = eshtebah + 1;
                        Compute(GetUserInput());
                    }        
            }
        } catch (Exception e) {
            Compute(GetUserInput());
        }
    }
    public static void main(String[] args) {
    	// بازی رو شروع کن
        new Main().startGame();
    }
}
