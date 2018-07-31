ResultSetHandler实现类介绍（由DbUtils框架提供）
 	  ①ArrayHandler：     将查询结果的第一行数据，保存到Object数组中
      ②ArrayListHandler     将查询的结果，每一行先封装到Object数组中，然后将数据存入List集合
      ③BeanHandler     将查询结果的第一行数据，封装到user对象
      ④BeanListHandler     将查询结果的每一行封装到user对象，然后再存入List集合
      ⑤ColumnListHandler     将查询结果的指定列的数据封装到List集合中
      ⑥MapHandler     将查询结果的第一行数据封装到map结合（key==列名，value==列值）
      ⑦MapListHandler     将查询结果的每一行封装到map集合（key==列名，value==列值），再将map集合存入List集合
      ⑧BeanMapHandler     将查询结果的每一行数据，封装到User对象，再存入mao集合中（key==列名，value==列值）
      ⑨KeyedHandler     将查询的结果的每一行数据，封装到map1（key==列名，value==列值 ），然后将map1集合（有多个）存入map2集合（只有一个）
      ⑩ScalarHandler     封装类似count、avg、max、min、sum......函数的执行结果
除了使用以上结果集的封装以外, 还可以使用自定义的结果封装
public class MyHandler implements ResultSetHandler<List<User>>
--------------------gson反序列/序列化一个参数数组类型----------------------------
private static void gsonTypeToken(String jsons) {
        Gson gson = new Gson();
        // List users = gson.fromJson(jsons, List.class); // 泛型擦除：写的任何的泛型类，变成.class之后泛型都会丢失
        TypeToken<List<User>> listType = new TypeToken<List<User>>() {
        }; // TypeToken<>(){} --> (protected)抽象类 --> 记住泛型的类型 --> new了TypeToken的匿名内部类 
        List<User> users = gson.fromJson(jsons, listType.getType());