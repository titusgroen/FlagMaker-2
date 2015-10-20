package flagmaker.Overlays.OverlayTypes.PathTypes;

import flagmaker.Data.Vector;

public class OverlayFleurDeLis extends OverlayPath
{
	private final String Path = "m 24.465738,18.132503 c 1.60698,-2.38998 1.46998,-7.62192 -1.74298,-9.4689124 -2.45798,-1.22898 -5.23395,-0.74799 -6.53094,0.31 -2.08798,1.2629924 -4.098961,5.3019524 -4.098961,9.3919124 l 7.209931,-0.009 -0.002,8.05092 -14.963845,-0.008 c 0.196,4.14096 2.4539801,7.45792 6.655924,9.3049 -0.540987,1.74499 -3.0749639,5.30195 -6.554924,5.06095 -0.6869901,3.76397 -1.3399901,5.87694 -4.46895996,9.29691 -3.13096014,-3.41897 -3.78396014,-5.53294 -4.47095014,-9.29691 -3.4799703,0.241 -6.0139459,-3.31596 -6.5549459,-5.06095 4.2019656,-1.84698 6.4599459,-5.16394 6.6559459,-9.3049 l -14.9648549,0.008 v -8.05092 l 7.207929,0.009 c 0,-4.08996 -2.00798,-8.12892 -4.097959,-9.3919124 -1.29699,-1.05699 -4.07196,-1.53798 -6.52894,-0.31 -3.21496,1.8469924 -3.35296,7.0799324 -1.74598,9.4689124 -15.18185,-2.81897 -13.67586,-17.48083228 -8.50391,-22.8037727 4.17995,-4.299957 8.73691,-4.9719467 12.25087,-3.615967 7.985919,2.862967 13.3568746,12.4028773 13.6178746,26.6527397 h 4.1759503 c 0,-12.9538724 -2.2539703,-17.0838324 -8.1269259,-33.353667 -2.95797,-7.68892 -1.18098,-17.19483 4.1069656,-25.94774 1.8939803,-3.13697 4.2599603,-5.96894 6.97893044,-9.00191 2.71697986,3.03297 5.08295006,5.86494 6.97693006,9.00191 5.2879439,8.75291 7.0649239,18.25882 4.1089539,25.94774 C 5.1789332,1.2816706 2.9249529,5.4106306 2.9249529,18.365503 h 4.1759602 c 0.261,-14.2498624 5.6339439,-23.7897727 13.6178649,-26.6527397 3.51396,-1.3549797 8.07392,-0.68399 12.25187,3.615967 5.17095,5.32294042 6.67694,19.9848027 -8.50491,22.8037727 z";
	private final Vector PathSize = new Vector(80, 101);
	
	public OverlayFleurDeLis(int maximumX, int maximumY)
	{
		super("fleur de lis", maximumX, maximumY);
		Constructor(Path, PathSize);
	}	
}
