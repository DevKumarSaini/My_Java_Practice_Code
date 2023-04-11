package Practice_Programs;

abstract public class plan {
    protected double rate;
    abstract void getRate();
    public void calculateBill(int unit){
        System.out.println(unit * rate);
    }
}
class DomesticPlan extends plan{
    public void getRate(){
        rate=3.50;
    }
}
class CommercialPlan extends plan{
    public void getRate(){
        rate=7.50;
    }
}
class IndustrialPlan extends plan{
    public void getRate(){
        rate=5.50;
    }
}
class GetPlanFactory{
    public plan getPlan(String planType){
        if(planType == null){
            return  null;
        }
        else if(planType.equalsIgnoreCase("Domesticplan")){
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("CommercialPlan")){
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("IndustrialPlan")) {
            return new IndustrialPlan();
        }
        return null;
    }
    //-------------------------------- Incomplete Program
}
