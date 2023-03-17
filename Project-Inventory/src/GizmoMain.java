import java.util.ArrayList;
import java.util.List;

/**
 * keeps track of gizmo supplies
 */
public class GizmoMain {

    public static void main(String[] args){

        List<Gizmo> gizmos = new ArrayList<>();
        gizmos.add(new Gizmo("Waxbill", 618001, 2015,3, 499.99));
        gizmos.add(new Gizmo("Heron", 618002, 2016,13, 299.99));
        gizmos.add(new Gizmo("Crane", 618003, 2017,195, 49.99));
        gizmos.add(new Gizmo("Duck", 618004, 2018,295, 99.99));
        gizmos.add(new Gizmo("Wallaby", 618005, 2019,973, 149.99));
        gizmos.add(new Gizmo("Egret", 618006, 2020,495, 199.99));
    }
}
