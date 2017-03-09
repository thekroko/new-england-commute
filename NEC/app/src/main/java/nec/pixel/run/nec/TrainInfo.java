package nec.pixel.run.nec;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

final class TrainInfo {
    public static class Train {
        protected Train() {}

        public String SourceStation;
        public Date SourceScheduleTime;
        public String DestinationStation;
        public Date DestinationScheduleTime;
        public int DelayInSeconds;
        public int Track;
    }

    public static TrainInfo get() {
        return new TrainInfo();
    }

    public List<Train> getNextTrains(int maxTrains) {
        List<Train> trains = new ArrayList<Train>();

        // Train with ALL infos
        Train t1 = new Train();
        t1.SourceStation = "Grand Central";
        t1.DestinationStation = "South Norwalk";
        t1.DelayInSeconds = 60*3;
        t1.Track = 5;
        trains.add(t1);

        // Train with minimal info
        Train t2 = new Train();
        t2.SourceStation = "Grand Central";
        t2.DestinationStation = "South Norwalk";
        trains.add(t2);

        return trains;
    }
}
