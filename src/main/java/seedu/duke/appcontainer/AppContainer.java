package seedu.duke.appcontainer;

import seedu.duke.calender.Calendar;
import seedu.duke.UniTasker;
import seedu.duke.coursestracker.CourseParser;
import seedu.duke.storage.Storage;
import seedu.duke.tasklist.CategoryList;

public class AppContainer {
    private final CategoryList categories;
    private final Calendar calendar;
    private final Storage storage;
    private final CourseParser courseParser;


    public AppContainer(CategoryList categories, Calendar calendar, Storage storage,
                        CourseParser courseParser, int dailyTaskLimit, int startYear, int endYear) {
        this.categories = categories;
        this.calendar = calendar;
        this.storage = storage;
        this.courseParser = courseParser;
    }

    public CategoryList getCategories() {
        return categories;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public Storage getStorage() {
        return storage;
    }

    public CourseParser getCourseParser() {
        return courseParser;
    }

    public int getDailyTaskLimit() {
        return UniTasker.getDailyTaskLimit();
    }

    public void setDailyTaskLimit(int dailyTaskLimit) {
        UniTasker.setDailyTaskLimit(dailyTaskLimit);
    }

    public int getStartYear() {
        return UniTasker.getStartYear();
    }

    public int getEndYear() {
        return UniTasker.getEndYear();
    }

    public void setEndYear(int endYear) {
        UniTasker.setEndYear(endYear);
    }
}
