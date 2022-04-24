package OOP;

public class SuperNumber<T extends Number> {

    private T num;


    public SuperNumber(T num) {
        this.num = num;
    }


    public void showType(){
        System.out.println(num.getClass().getName());
    }

    public double returnDoubleValue(){
        return num.doubleValue();
    }

    public int returnIntegerValue(){
        return num.intValue();
    }
    public boolean genericNumber(){
        if (num.doubleValue() == num.intValue()){
            return true;
        } else{
            return false;
        }

    }

    public boolean checkValueIntSuperNumber(SuperNumber<?> anotherSuperNumber){
        if (num.intValue() == anotherSuperNumber.num.intValue()){
            return true;
        }else{
            return false;
        }

    }

    public boolean checkValueDoubleSuperNumber(SuperNumber<?> anotherSuperNumber){
        if (num.doubleValue() == anotherSuperNumber.num.doubleValue()){
            return true;
        }else{
            return false;
        }

    }
    
}
