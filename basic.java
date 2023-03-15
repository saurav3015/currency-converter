

// import java.text.DecimalFormat;
// import java.text.Format;
// import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;


// import java.util.Random;
// //random password genrator 
// class basic  {
//     public static void main(String args[])
//     {
//      int length = 10;
//      System.out.println(geek_password(length));
//     }
//     static char[] geek_password(int len)
//     {
//         System.out.println("genrating password using random number () : ");

//             System.out.print(" your new password is : ");
//         String    capital_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//         String small_char       = "abcdefghijklmnopqrstuvwxyz";
//         String number = "0123456789";
//         String symbols = "!@#$%^&*_=+-/.<>)";
//         String values = capital_char + small_char + number + symbols;
//         Random rndm_method = new Random();
//         char[] password = new char[len];
//         for(int i = 0;i <len; i++){
//             password[i] = values.charAt(rndm_method.nextInt(values.length()));

//         }
//         return password;
//     }
// }


   //currancy convert 
   

// class basic {
//     public static void main(String args[]){
//       double amount, dollar, pound, euro, yen, ringgit, rupee;
//       DecimalFormat f = new DecimalFormat("##.##");
//       Scanner sc = new Scanner(System.in);
//       System.out.println(" hello saurav welcome to currancy convertor ");

//       System.out.println(" which currancy you want to convert ? ");

//       System.out.println("1:Rupee \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
//        int  code = sc.nextInt();
//       System.out.println(" how much money you want to convert ?");
//       amount = sc.nextFloat();
      
//       // for amount convertor
//       if(code == 1)
//       {
//         dollar = amount / 70;
//         System.out.println("your" + amount + " rupee is : " +  f.format(dollar) + "dollar");

//         pound = amount / 88;
//         System.out.println(" you"+ amount + "rupee is : "  + f.format(pound) + "pound");

//         euro = amount / 88;
//         System.out.println(" your"+ amount + " rupee is : " + f.format(euro) + "euro");

//         yen = amount /0.63;
//         System.out.println("your"+ amount + "rupee is : " + f.format(yen) + "yen ");

//         ringgit = amount / 16;
//         System.out.println(" your " + amount + " rupee is " + f.format(ringgit) + " ringgit");
//       } else if ( code == 2)
//       {
//         // for dollar conversation 

//         rupee = amount * 70;
//         System.out.println(" your "+ amount + " rupee is :"+ f.format(rupee) + " rupee");

//         pound = amount * 0.78;
//         System.out.println(" your "+  amount+ " ruper is : "+ f.format(pound) + "pound" );

//         euro = amount *0.87;
//         System.out.println(" your " + amount + "rupee is :" + f.format(euro) + " euro"  );

//         yen = amount * 111.087;
//         System.out.println(" your " + amount + "rupee is : "+  f.format(yen) + "yen");

//         ringgit = amount *4.17;
//         System.out.println(" your " + amount + " rupee is : " + f.format(ringgit) + " ringgit");
        
//       }else if( code == 3){
//         // for pound conversation

//         rupee = amount * 88;
//         System.out.println("your" + amount + " rupee is : " + f.format(rupee) + "rupee");

//         dollar = amount * 1.26;
//         System.out.println(" your "+  amount+ " ruper is : "+ f.format(dollar) + "dollar" );

//         euro = amount *1.10;
//         System.out.println(" your " + amount + "rupee is :" + f.format(euro) + " euro"  );

//         yen = amount * 140.93;
//         System.out.println(" your " + amount + "rupee is : "+  f.format(yen) + "yen");

//         ringgit = amount *5.29;
//         System.out.println(" your " + amount + " rupee is : " + f.format(ringgit) + " ringgit");

//       }else if ( code == 4){
//         // for euro convert

//         rupee = amount * 80;
//         System.out.println("your" + amount + " rupee is : " + f.format(rupee) + "rupee");

//         dollar = amount * 1.14;
//         System.out.println(" your "+  amount+ " ruper is : "+ f.format(dollar) + "dollar" );

//         pound = amount *0.90;
//         System.out.println(" your " + amount + "rupee is :" + f.format(pound) + " pound"  );

//         yen = amount * 127.32;
//         System.out.println(" your " + amount + "rupee is : "+  f.format(yen) + "yen");

//         ringgit = amount *4.78;
//         System.out.println(" your " + amount + " rupee is : " + f.format(ringgit) + " ringgit");

//       }else if( code == 5){
//         // for yen convert
//         rupee = amount * 0.63;
//         System.out.println("your" + amount + " rupee is : " + f.format(rupee) + "rupee");

//         dollar = amount * 0.008;
//         System.out.println(" your "+  amount+ " ruper is : "+ f.format(dollar) + "dollar" );

//         pound = amount *0.007;
//         System.out.println(" your " + amount + "rupee is :" + f.format(pound) + " pound"  );

//         euro = amount * 0.007;
//         System.out.println(" your " + amount + "rupee is : "+  f.format(euro) + "euro");

//         ringgit = amount *0.037;
//         System.out.println(" your " + amount + " rupee is : " + f.format(ringgit) + " ringgit");

//       }else if( code == 6){
//         // for ringgit convert
//         rupee = amount * 16.8;
//         System.out.println("your" + amount + " rupee is : " + f.format(rupee) + "rupee");

//         dollar = amount * 0.239;
//         System.out.println(" your "+  amount+ " ruper is : "+ f.format(dollar) + "dollar" );

//         euro = amount * 0.209;
//         System.out.println(" your " + amount + "rupee is :" + f.format(euro) + "euro"  );

//         yen = amount * 26.63;
//         System.out.println(" your " + amount + "rupee is : "+  f.format(yen) + "yen");

//         pound = amount *0.188;
//         System.out.println(" your " + amount + "rupee is : " + f.format(pound) + "pound");

//       }
//       else {
//         System.out.println("invalid input ");
//       }
//       System.out.println("thank you for using  currancy convertor");
      
//     }
// }


