import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Getter
@RequiredArgsConstructor
public final class Contract {

    private final Integer id;

    private final Integer number;

    private final Date createAt;

    private final String clientName;

    private final String clientPhone;
}
