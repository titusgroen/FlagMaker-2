package flagmaker.Overlays.OverlayTypes.PathTypes;

import flagmaker.Data.Vector;

public class OverlayYin extends OverlayPath
{
	private final String Path = "M 83.20869,-55.472461 A 50.0022,50.0022 0 0 1 0,0 50.0022,50.0022 0 1 0 -83.20869,55.472461 100.0044,100.0044 0 1 0 83.20869,-55.472461 z";
	private final Vector PathSize = new Vector(200, 200);

	public OverlayYin(int maximumX, int maximumY)
	{
		super("yin", maximumX, maximumY);
		Constructor(Path, PathSize);
	}
}
