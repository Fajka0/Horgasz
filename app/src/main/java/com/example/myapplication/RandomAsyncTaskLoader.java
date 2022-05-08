package com.example.myapplication;




        import android.content.Context;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.loader.content.AsyncTaskLoader;

        import java.util.Random;

public class RandomAsyncTaskLoader  extends AsyncTaskLoader<String> {
    public RandomAsyncTaskLoader(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();

        forceLoad();
    }

    @Nullable
    @Override
    public String loadInBackground() {
        Random r = new Random();
        int n = r.nextInt(11);
        int ms = n * 300;
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Bejelentekezés vendégként " + ms + " ms után!";
    }
}
