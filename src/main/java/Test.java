import adpter.HdmiVgaAdapter;
import adpter.HdmiVgaAdapterHeritage;
import computer.SuperVP;
import computer.Ecran;
import computer.TV;
import computer.UniteCentre;
import computer.VideoProjector;

public class Test {
    public static void main(String[] args) {
        UniteCentre uniteCentre = new UniteCentre();
        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Bonjour");

        uniteCentre.setVga(new VideoProjector());
        uniteCentre.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Hola");

        uniteCentre.setVga(new SuperVP());
        uniteCentre.print("Gracias");

        HdmiVgaAdapter hdmiVgaAdapter1 = new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentre.setVga(hdmiVgaAdapter1);
        uniteCentre.print("Obrigado");

        HdmiVgaAdapterHeritage hdmiVgaAdapterHeritage=new HdmiVgaAdapterHeritage();
        uniteCentre.setVga(hdmiVgaAdapterHeritage);
        uniteCentre.print("Test");
    }
}
