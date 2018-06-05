package refat.com.androidrefactor.main;

/**
 * Created by refat on 05.06.18.
 * Responsible for holding the actions from the view and updating the UI as required.
 */

public class MainPresenterImpl  {

    private MainContract.MainViewInterface mMainViewInterface;

   public  MainPresenterImpl (MainContract.MainViewInterface _mMainViewInterface){
        this.mMainViewInterface=_mMainViewInterface;

    }
}
