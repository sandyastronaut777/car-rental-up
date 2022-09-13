package com.example.carrental.utility;

interface camera{
    void capturePic();
    void recordVdo();
    void call();

}
interface tv{
    String[] news();
    String[] cartoon();
}
interface phone{
    void call();
    void game();

}
class device implements camera, tv, phone {
    @Override
    public void capturePic() {
        System.out.println("Capturing Pic");
    }

    @Override
    public void recordVdo() {
        System.out.println("Recording video");
    }

    @Override
    public String[] news() {
        System.out.println("List of News Channel");
        String[] chN = {"BBC","India Today","TimesOfIndia"};
        return chN;
    }

    @Override
    public String[] cartoon() {
        System.out.println("List of Cartoon ");
        String[] chC = {"Hungama", "Disney", "CN"};
        return chC;
    }

    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void game() {
        System.out.println("Playing");
    }

}

public class gadget  {
    public static void main(String[] args) {
        device dv = new device();
        String[] a = dv.news();
        String[] b = dv.cartoon();
        dv.call();

        for (String item : a) {
            System.out.println(item);
        }
        for (String item2: b){
            System.out.println(item2);
        }

    }
}
