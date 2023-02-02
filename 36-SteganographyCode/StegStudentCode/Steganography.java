import java.awt.Color;
public class Steganography{
	public static void main(String[] args){
		Picture blueCycle = new Picture("blueMotorcycle.jpg");
		Picture arch = new Picture("arch.jpg");
		Picture beach = new Picture("beach.jpg");
		Picture copy = testSetLow(beach, Color.PINK);
		copy = testClearLow(beach);
		Picture copy2 = revealPicture(copy);
		System.out.println(canHide(beach, blueCycle));
		System.out.println(canHide(beach, arch));
		Picture test = hidePicture(beach, blueCycle);
		beach.explore();
		test.explore();
	}
	public static Picture testClearLow(Picture a){
		Picture b = new Picture(a);
		for(int i = 0; i < b.getHeight(); i++){
		    for(int j = 0; j < b.getWidth(); j++){
		        clearLow(b.getPixel(j, i));
		      }
		}
		return b;
	}
	public static void clearLow(Pixel p){
		p.setRed((int)(p.getRed() / 4) * 4);
		p.setBlue((int)(p.getBlue() / 4) * 4);
		p.setGreen((int)(p.getGreen() / 4) * 4);
	}	
	public static Picture testSetLow(Picture a,Color c){
		Picture b = new Picture(a);
		for (int i = 0; i < b.getHeight(); i++){
			for (int j = 0; j < b.getWidth(); j++){
				setLow(c,b.getPixel(j,i));
			}
		}
		return b;
	}
	public static void setLow(Color b,Pixel a){
		clearLow(a);
		a.setRed(a.getRed()+(b.getRed()/64));
		a.setBlue(a.getBlue()+(b.getBlue()/64));
		a.setGreen(a.getGreen()+(b.getGreen()/64));
	}
	public static Picture revealPicture(Picture a){
	        Pixel[][] aa = a.getPixels2D();
		Picture b = new Picture(a);
		Pixel[][] d = b.getPixels2D();
		for (int r = 0; r < d.length; r++){
			for (int c = 0; c < d[0].length; c++){
				Color col = aa[r][c].getColor();
				d[r][c].setRed(d[r][c].getRed()%64+col.getRed()%4*64);
				d[r][c].setBlue(d[r][c].getBlue()%64+col.getBlue()%4*64);
				d[r][c].setGreen(d[r][c].getGreen()%64+col.getGreen()%4*64);
			}
		}
		return b;
	}
	public static Picture hidePicture(Picture a, Picture b){
		if (!canHide(a,b)){
		    return null;
		}
		Picture s = new Picture(a);
		Pixel[][] ss = s.getPixels2D();
		Pixel[][] cc = b.getPixels2D();
		for (int r = 0; r < ss.length; r++){
			for (int c = 0; c < ss.length; c++){
				setLow(cc[r][c].getColor(),ss[r][c]);
			}
		}
		return s;
	}
	public static boolean canHide(Picture a, Picture b){ 
		if(a.getHeight()==b.getHeight()&&a.getWidth()==b.getWidth()) return true;
		return false;
	}
	
}