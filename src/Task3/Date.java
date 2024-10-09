package Task3;

 class Date {
         private int day;
         private int month;
         private int year;

     public int getDay() {
         return day;
     }

     public int getMonth() {
         return month;
     }

     public int getYear() {
         return year;
     }

     public void setDay(int day) {
         setDate(day, month, year);
     }

     public void setMonth(int month) {
         setDate(day, month, year);
     }

     public void setYear(int year) {
         setDate(day, month, year);
     }

     public void showDate(){
         if(day<10) {System.out.print("0");}
         System.out.print(day+"/");
         if(month<10){System.out.print("0");}
         System.out.println(month+"/"+year);
     }
     public Date(int day, int month, int year) {
             setDate(day, month, year);
         }


         public void setDate(int day, int month, int year) {
             if (!isValidDate(day, month, year)) {
                 throw new IllegalArgumentException("Data gresita!!!");
             }
             this.day = day;
             this.month = month;
             this.year = year;
         }


         private boolean isValidDate(int day, int month, int year) {
             if (month < 1 || month > 12) {return false;}
             if (day < 1 || day > daysInMonth(month, year)) {return false;}
             if (year < 1) {return false;}
             return true;
         }

         private int daysInMonth(int month, int year) {
             switch (month) {
                 case 1,3,5,7,8,10,12:
                     return 31;
                 case 4,6,9,11:
                     return 30;
                 case 2:
                     return  anBisect(year);
                 default: return 0;

             }
         }
         private int anBisect(int year)
         {
             if(year%4==0) {return 29;}
             else {return 28;}
         }



     }



