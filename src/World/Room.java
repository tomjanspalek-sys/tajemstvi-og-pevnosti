package World;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class Room {

    private String id;
    private String name;
    private String description;
    private Connections connections;
    private List<String> items;


}
