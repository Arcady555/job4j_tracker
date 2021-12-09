package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobComparatorTest {
    /** Тест-образец в уроке,
      не стал трогать
    */
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    /** Из условия:
     1. ....создайте 4 компаратора:
     - по возрастанию имени;
     - по возрастанию приоритета;
     - по убыванию имени;
     - по убыванию приоритета.
     2. Напишите тесты, проверяющие отдельно поведение компараторов.
    */
    @Test
    public void whenSortByName() {
        Comparator<Job> name = new SortByNameJob();
        int rsl = name.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenSortByPriority() {
        Comparator<Job> name = new SortByPriorityJob();
        int rsl = name.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenSortDescByName() {
        Comparator<Job> name = new JobDescByName();
        int rsl = name.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenSortDescByPriority() {
        Comparator<Job> name = new JobDescByPriority();
        int rsl = name.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    /** 3. Напишите тесты, проверяющие поведение комбинированных компараторов.
    */
    @Test
    public void whenComparatorByNameAndPriorityOfMe() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }
}