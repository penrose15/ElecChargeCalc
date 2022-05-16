package electronicCalc;

public class CalcBasic {


    private int use;
    private int basic;
    private double perKw;


    private final double eco = 7.3;
    private double total;

    private double charge;


    public int getUse() {
        return use;
    }

    public void setUse(int use) {
        if(use<0) this.use =  0;
        else{
        this.use = use;}
    }

    public int getBasic() {
        if(getUse()<0) return basic = -1;
        else if(getUse()>0 && getUse()<=100) {
            basic  = 460;
            return basic;
        }
        else if(getUse()>100 && getUse()<=200) {
            basic  = 610;
            return basic;
        }
        else if(getUse()>200 && getUse()<=300) {
            basic  = 910;
            return basic;
        }
        else if(getUse()>300 && getUse()<=400) {
            basic  = 1600;
            return basic;
        }
        else if(getUse()>400 && getUse()<=500) {
            basic  = 7300;
            return basic;
        }
        else if(getUse()>500) {
            basic  = 9100;
            return basic;
        }
        else { return basic = -1;}
    }


    public double getPerKw() {
        if(getUse()>0 && getUse()<=100){
            this.perKw = 60.7;
            return perKw*getUse();
        }
        else if(getUse()>100 && getUse()<=200){
            this.perKw = 125.9;
            return (perKw*(getUse()-100) + 60.7*100);
        }
        else if(getUse()>200 && getUse()<=300){
            this.perKw = 187.9;
            return (perKw*(getUse()-200) + (125.9*100) + (60.7*100));
        }
        else if(getUse()>300 && getUse()<=400){
            this.perKw = 280.6;
            return (perKw*(getUse()-300) +(187.9*100)+ (125.9*100) + (60.7*100));
        }
        else if(getUse()>400 && getUse()<=500){
            this.perKw = 417.7;
            return (perKw*(getUse()-400) +(280.6*100)+ (187.9*100)+ (125.9*100) + (60.7*100));
        }
        else if(getUse()>500){
            this.perKw = 670.6;
            return (perKw*(getUse()-500)+(417*100) +(280.6*100)+ (187.9*100)+ (125.9*100) + (60.7*100));
        }
        else { perKw = 0; return perKw;}
    }

    public double ecoPrice = eco*getUse();

    public double vat = getTotal() * 0.1;

    public double getTotal() {
        total = getPerKw() + getBasic();
        return total;
    }
    public double getCharge() {
        charge = getTotal() + vat + ecoPrice;
        if(getUse() == 0) return charge = 0.00;
        else {
        return charge;}
    }




//    public void calc(int use) {
//        if(use<0) {
//            this.basic = -1;
//            this.perKw = -1;}
//        if(use>0 && use<100) {
//            this.basic = 460;
//            this.perKw = 60.7;
//        }
//
//    }

}
