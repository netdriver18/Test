package module3.homeTask1;

public class Enum {

    enum Seasons {
        WINTER, SPRING, SUMMER, AUTUMN;
    }

    enum MonthOfYear {
        JANUARY(Seasons.WINTER, 31),
        FEBRUARY(Seasons.WINTER, 28),
        MARCH(Seasons.SPRING, 31),
        APRIL(Seasons.SPRING, 30),
        MAY(Seasons.SPRING, 31),
        JUNE(Seasons.SUMMER, 30),
        JULY(Seasons.SUMMER, 31),
        AUGUST(Seasons.SUMMER, 30),
        SEPTEMBER(Seasons.AUTUMN, 31),
        OCTOBER(Seasons.AUTUMN, 30),
        NOVEMBER(Seasons.AUTUMN, 31),
        DECEMBER(Seasons.WINTER, 30);

        Seasons seasons;
        Integer day;

        public String getSeasons() {
            return seasons.name();
        }

        public Integer getDay() {
            return day;
        }

        MonthOfYear(Seasons seasons, Integer day) {
            this.seasons = seasons;
            this.day = day;
        }
    }
}





