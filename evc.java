import java.util.Scanner;

public class evc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 1234;
        double haraa = 900.0;
        String t1 = "", t2 = "", t3 = "";
        System.out.println("Fadlan geli PIN-kaaga sirta:");
        int userPin = input.nextInt();

        if (userPin != pin) {
            System.out.println(" PIN-ka waa khalad. Fadlan isku day mar kale.");
            return;
        }

        int doorasho;
       //doorasho
        do {
            System.out.println("\n EVC Plus Hormuud ");
            System.out.println("moha================xassan===============adan");
            System.out.println("1.  Haraaga");
            System.out.println("2.  Dir Lacag");
            System.out.println("3.  Ka bixi Lacag");
            System.out.println("4. 3-da Dhaqdhaqaaq Ugu Danbeeyey");
            System.out.println("5.  Ka bax");
            System.out.println("6.  Dir Fariin");
            System.out.println("7.  Beddel PIN-ka");
            System.out.print("\n Dooro adeegga aad rabto: ");
            doorasho = input.nextInt();
            switch (doorasho) {
                //inta waa mmesha haraga
                case 1:
                    System.out.print("Geli PIN-kaaga si aad haraaga u aragto: ");
                    int pinCheck = input.nextInt();
                    if (pinCheck == pin) {
                        System.out.println("Haraagaagu waa: $" + haraa);
                    } else {
                        System.out.println("PIN-ka khaldan. Lama arki karo haraaga.");
                    }
                    break;
                  //dir lacag adigoo galinayo passworka
                case 2:
                    System.out.print("Geli number-ka aad u direyso lacagta: ");
                    String number = input.next();
                    System.out.print("Geli lacagta aad dirayso: ");
                    double dirLacag = input.nextDouble();

                    System.out.print("Geli PIN-kaaga si aad lacagta u dirto: ");
                    int pinCheck2 = input.nextInt();

                    if (pinCheck2 == pin) {
                        if (dirLacag <= haraa) {
                            haraa -= dirLacag;
                            System.out.println("Waxaad u dirtay $" + dirLacag + " number-ka: " + number + ". Haraagaagu waa $" + haraa);
                            t1 = t2;
                            t2 = t3;
                            t3 = "Dirid: $" + dirLacag + " → " + number + " | Haraa: $" + haraa;
                        } else {
                            System.out.println("Haraagaaga kuguma filna.");
                        }
                    } else {
                        System.out.println("PIN-ka khaldan. Lama diri karo lacagta.");
                    }
                    break;

                //kalabax lacag withdraw
                case 3:
                    System.out.print("Geli lacagta aad rabto inaad ka la baxdo: ");
                    double bixid = input.nextDouble();
                    System.out.print("Geli PIN-kaaga si aad lacagta ula baxdo: ");
                    int pinCheck3 = input.nextInt();
                    if (pinCheck3 == pin) {
                     if (bixid <= haraa) {
                        haraa -= bixid;
                        System.out.println(" Waxaad ka bixisay $" + bixid + " | Haraa: $" + haraa);
                        t1 = t2;
                        t2 = t3;
                        t3 = "Ka bixid: $" + bixid + " | Haraa: $" + haraa;
                    } else {
                        System.out.println(" Haraagaaga kuguma filna.");
                    }
            } else {
                System.out.println("PIN-ka khaldan. Lama diri karo lacagta.");
            }
                    break;
            //3sadexda dhakh ugu danbeeye
                case 4:
                    System.out.println("3-da Dhaqdhaqaaq ee ugu danbeysay:");
                    if (!t1.equals("")) System.out.println("1. " + t1);
                    if (!t2.equals("")) System.out.println("2. " + t2);
                    if (!t3.equals("")) System.out.println("3. " + t3);
                    break;
               //kabax programka
                case 5:
                    System.out.println(" Waad ka baxday EVC Plus. Mahadsanid.");
                    break;
               //dir fariim
                case 6:
                    System.out.print("Geli number-ka aad fariinta u direyso: ");
                    String msgNumber = input.next();
                    System.out.print("Geli fariinta: ");
                    input.nextLine();
                    String message = input.nextLine();

                    System.out.println(" Fariinta \"" + message + "\" ayaa loo diray " + msgNumber);
                    t1 = t2;
                    t2 = t3;
                    t3 = "Fariin: \"" + message + "\" → " + msgNumber;
                    break;
                    //iska badal biinka adigoo abuuraya new pin
                case 7:
                    System.out.print("Geli PIN-kaaga hadda: ");
                    int oldPin = input.nextInt();
                    if (oldPin == pin) {
                        System.out.print("Geli PIN cusub: ");
                        int newPin = input.nextInt();
                        pin = newPin;
                        System.out.println(" PIN-kaaga waa la beddelay si guul leh!");
                        t1 = t2;
                        t2 = t3;
                        t3 = "PIN-ka la beddelay";
                    } else {
                        System.out.println(" PIN-kii hore ee aad gelisay waa khalad.");
                    }
                    break;
                default:
                    System.out.println(" Doorasho aan sax ahayn.");

            }

        } while (doorasho !=7);
    }
}

