public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

      // System.out.println ("A TV está ligada? " + smartTv.ligada);
       System.out.println ("Canal Atual: " + smartTv.canal);
      // System.out.println("Volume atual: " + smartTv.volume);


        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(13);

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Volume atual: " +smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}