package dk.au.madf21.au299473.viewbinding;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int count = 0;
    private MutableLiveData<String> clicks;

    public LiveData<String> getClicks() {
        if(clicks == null) {
            clicks = new MutableLiveData<>();
        }
        return clicks;
    }

    public void tick() {
        clicks.setValue("" + (count += 1));
    }
}
