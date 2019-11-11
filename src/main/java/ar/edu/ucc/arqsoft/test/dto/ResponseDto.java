package ar.edu.ucc.arqsoft.test.dto;

public class ResponseDto {

    private String auth;
    private int code;
    private String status;

    public ResponseDto(String auth, int code, String status) {
        this.auth = auth;
        this.code = code;
        this.status = status;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
