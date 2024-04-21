class Main{
    public static void main(String[] args){
        Ac sharp = new Ac();
        Melangkah kaki = new Melangkah();

        sharp.acSwitch(true);
        sharp.acSwitch(false);

        kaki.melangkah("kanan");
        kaki.melangkah("kiri");
        kaki.melangkah("kanan");
        kaki.melangkah("kiri");
    }
}