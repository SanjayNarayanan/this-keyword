package prtsc;

class rain{
    int age;
    char gender;
   void print(char gender, int age){
   this. gender=gender;
     this.age=age;
   }
}

class tree extends rain{
    int age;
}

class flood{
    public static void main(String[] args) {
        rain obj =new rain();
        obj.print(gender:'m',age:30);
        System.out.println(obj.gender);
        System.out.println(obj.age);

    }
}