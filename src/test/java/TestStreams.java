import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestStreams {

    @Test
    public void given_list_of_floats_shoud_floor_them_all() {
        var input = Arrays.asList(0.5, 1.2, 2.3, 4.6, 8.1);

        List<Integer> result = null; // = input.stream().???;

        assertThat(result, contains(0,1,2,4,8));
    }
}
