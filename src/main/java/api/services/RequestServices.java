package api.services;



import java.io.BufferedReader;
import java.util.List;

import com.google.gson.Gson;

import api.contracts.InterfaceService;
import api.models.Request;
import api.payloads.RequestPayload;

public class RequestServices implements InterfaceService {
    private Request request;
    private Gson gson;

    public RequestServices() {
        this.request = new Request();
        this.gson = new Gson();
    }

    public List<Object> index() {
        return request.index();
    }
    @Override
    public Object store(BufferedReader body) {

        try {
            RequestPayload requestPayload = gson.fromJson(body, RequestPayload.class);
            RequestPayload requestAdded = request.save(requestPayload);
            return requestAdded;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }

    }
}
