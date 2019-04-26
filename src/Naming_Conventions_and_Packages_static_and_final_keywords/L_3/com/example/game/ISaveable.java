package Naming_Conventions_and_Packages_static_and_final_keywords.L_3.com.example.game;


import java.util.List;

public interface ISaveable {
  List<String> write();
  void read(List<String> savedValues);

}
