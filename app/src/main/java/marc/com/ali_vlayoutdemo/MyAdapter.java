package marc.com.ali_vlayoutdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.VirtualLayoutManager;

/**
 * Created by Broderick
 * User: Broderick
 * Date: 2017/5/17
 * Time: 10:13
 * Version: 1.0
 * Description:
 * Email:wangchengda1990@gmail.com
 **/
public class MyAdapter extends DelegateAdapter.Adapter {
	public MyAdapter() {
	}

	@Override
	public LayoutHelper onCreateLayoutHelper() {
		return null;
	}

	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return null;
	}

	@Override
	public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

	}

	@Override
	public int getItemCount() {
		return 0;
	}

	class MyHolder extends RecyclerView.ViewHolder{
		public MyHolder(View itemView) {
			super(itemView);
		}
	}
}
