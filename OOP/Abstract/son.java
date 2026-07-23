package OOP.Abstract;

public class son extends parent{
    //all methods  of parent should used by son
    @Override
    void career(String name){
        System.out.println("i am going to be doct");

    }
    @Override
    void partner(String name,int age){
        System.out.println("i love"+name+age);

    }
}

