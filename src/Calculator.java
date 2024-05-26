import java.util.List;

public class Calculator {

    private Calculator() {
    }

    public static double calculate(List<MediaItem> mediaItems) {
        double minutes = 0;
        for (MediaItem mediaItem : mediaItems) {
            double runtime;
            if (mediaItem instanceof Movie) {
                runtime = mediaItem.getRuntime();
            } else {
                runtime = ((Series) mediaItem).getSeriesCount() * mediaItem.getRuntime();
            }
            minutes += runtime;
        }
        return minutes / 1440;
    }
}