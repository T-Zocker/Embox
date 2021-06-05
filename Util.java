import GLOOP.*;

public interface Util {
    static GLQuader createCuboid(double posX, double posY, double posZ, double length, double height, double width) {
        GLQuader cuboid = new GLQuader(posX, posY, posZ, length, height, width);
        cuboid.setzeSelbstleuchten(255, 255, 255);
        return cuboid;
    }

    static GLKugel createSphere(double posX, double posY, double posZ, double radius) {
        GLKugel sphere = new GLKugel(posX, posY, posZ, radius);
        sphere.setzeSelbstleuchten(255, 255, 255);
        return sphere;
    }

    static GLTorus createTorus(double posX, double posY, double posZ, double radius, double thickness) {
        GLTorus torus = new GLTorus(posX, posY, posZ, radius, thickness);
        torus.setzeSelbstleuchten(255, 255, 255);
        return torus;
    }

    static GLZylinder createCylinder(double posX, double posY, double posZ, double radius, double height) {
        GLZylinder cylinder = new GLZylinder(posX, posY, posZ, radius, height);
        cylinder.setzeSelbstleuchten(255, 255, 255);
        return cylinder;
    }

    static GLKegelstumpf createTruncatedCone(double posX, double posY, double posZ, double radius1, double radius2, double height) {
        GLKegelstumpf torus = new GLKegelstumpf(posX, posY, posZ, radius1, radius2, height);
        torus.setzeSelbstleuchten(255, 255, 255);
        return torus;
    }

    static GLKegel createCone(double posX, double posY, double posZ, double radius, double height) {
        GLKegel torus = new GLKegel(posX, posY, posZ, radius, height);
        torus.setzeSelbstleuchten(255, 255, 255);
        return torus;
    }
}