package Challenge;

import java.util.List;

interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
