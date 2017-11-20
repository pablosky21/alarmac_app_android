package proyectotitulo2017.alarmacomunitariav2;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by Gamestorechile on 20-11-2017.
 */

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://10.0.2.2:8000/usuarios/";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, int age, String password, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("alarm_nombre", name);
        params.put("alar_edad", age + "");
        params.put("alarm_usuario", username);
        params.put("alarm_apelldio", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

