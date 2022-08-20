public class Student {
    private String name; 
    private int reg_no;
    private String branch;

    public void setName(String name){
        this.name=name;
        System.out.println(name);
    }
    public void setReg_no(int reg_no){  
        this.reg_no=reg_no;
        System.out.println(reg_no);
    }

    public void setBranch(String branch){  
        this.branch=branch;
        System.out.println(branch+"\n");
    }
}