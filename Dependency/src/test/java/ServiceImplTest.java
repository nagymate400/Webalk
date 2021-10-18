import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.InjectMocks.*;
import static org.mockito.Mockito.when;

class ServiceImplTest {
    @Mock
    Dependency dependency;
    @InjectMocks
    ServiceImpl service;

    @Test
    void TestCalculate() {

    }

    @Test
    void return5() {
        //GIVEN
        final int FIVE = 5;
        // WHEN
        int result = service.return5();
        // THEN
        assertEquals(FIVE, result);
    }

    @Test
    void dependencyReturnValueIsUsed() {
        //GIVEN
        final int FIVE = 5;

        when(dependency.helpNoParameterReturnValue().thenReturn(FIVE));
        // WHEN
        int result = service.callHelpAndUseReturnValue;
        // THEN
        assertEquals(FIVE, result);
    }


}