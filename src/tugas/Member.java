package tugas;

public class Member {
    private  boolean isMember;
    private String memberType;

    public Member(boolean isMember, String memberType){
        this.isMember = isMember;
        this.memberType = memberType;
    }

    public double getDiscount(){
        if (!isMember) {
            return 0.0;
        }
        if (memberType.equals("Premium")){
            return 0.10;
        } else if (memberType.equals("Gold")) {
            return 0.075;
        } else if (memberType.equals("Silver")) {
            return 0.05;
        }
        else {
            return 0.0;
        }
    }
}
