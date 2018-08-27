package br.com.fiap.educalab;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.educalab.models.AplicativoInstalado;

public class Adapter extends BaseAdapter{
    private int position;
    private Context ctx;
    //PackageManager pm = this.getPackageManager();
    //Intent intent = new Intent(Intent.ACTION_MAIN, null);

    List<AplicativoInstalado> list;

    public Adapter(Context ctx, List<AplicativoInstalado> list){
        this.ctx = ctx;
        this.list = list;
    }

    @Override
    public int getCount() {
        //tamanho da lista
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        //item referente a posição encontrada
        return list.get(position);
    }

    @Override
    public long getItemId(int position) { return position; }


    public View getView(int position, View view, ViewGroup viewGroup) {
        //ApplicationInfo appInfo = rInfo.activityInfo.applicationInfo;
        AplicativoInstalado app = list.get(position);

        ImageView iv = new ImageView(ctx);
        //pega uma imagem do tipo drawable de acordo com o nome do package manager do apk
        iv.setImageDrawable(app.getIcon());
        TextView t = new TextView(ctx);
        t.setText(app.getNome());
        return iv;
    }
}
