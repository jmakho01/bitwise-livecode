public class Practice {
    public static void main(String[] args) {
        int x = 0b10101; // same as x = 21
        int p = 0b11001;

        int q = x & p;
        System.out.println(Integer.toBinaryString(q));

        int y = 0xcf4e; // same as y = 53070
        int z = 94;

        System.out.println(x);
        System.out.println(y);
        System.out.println(Integer.toBinaryString(z));
        System.out.println(Integer.toHexString(z));

        int color = 0xc4246d;
        int blueMask = 0x0000ff;

        int blue = color & blueMask;
        System.out.println(Integer.toHexString(blue));

        int greenMask = 0x00ff00;
        int green = (color & greenMask) >> 8;
        System.out.println(Integer.toHexString(green));

        int redMask = 0xff0000;
        int red = (color & redMask) >> 16;
        System.out.println(Integer.toHexString(red));
    }
}