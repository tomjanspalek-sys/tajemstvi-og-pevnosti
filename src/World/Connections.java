package World;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class Connections {

        private String north;
        private int northID;
        private String south;
        private int southID;
        private String east;
        private int eastID;
        private String west;
        private int westID;


}

