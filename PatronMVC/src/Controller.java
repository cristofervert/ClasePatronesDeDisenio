public class Controller {
    private Model model;
    private View view;

    public Controller(Model m, View v){
        this.model = m;
        this.view = v;
    }
    public int getControllerId(){
        return model.getId();
    }
    public String getControllerData() {
        return model.getData();
    }
    public void setControllerData(String data) {
        model.setData(data);
    }
    public void setControllerId(int id) {
        model.setId(id);
    }
    public void updateView(){
        view.showModel(model.getData(), model.getId());
    }

}
