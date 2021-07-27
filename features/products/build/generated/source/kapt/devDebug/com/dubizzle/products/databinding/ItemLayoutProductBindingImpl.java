package com.dubizzle.products.databinding;
import com.dubizzle.products.R;
import com.dubizzle.products.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLayoutProductBindingImpl extends ItemLayoutProductBinding implements com.dubizzle.products.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvDesc, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLayoutProductBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemLayoutProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.ivLogo.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.cardview.widget.CardView) bindings[1];
        this.mboundView1.setTag(null);
        this.tvName.setTag(null);
        this.tvPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.dubizzle.products.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.itemViewModel == variableId) {
            setItemViewModel((com.dubizzle.domain.entity.response.products.ProductsEntity.Product) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.dubizzle.products.listeners.ProductClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable com.dubizzle.domain.entity.response.products.ProductsEntity.Product ItemViewModel) {
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    public void setListener(@Nullable com.dubizzle.products.listeners.ProductClickListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.dubizzle.domain.entity.response.products.ProductsEntity.Product itemViewModel = mItemViewModel;
        java.util.List<java.lang.String> itemViewModelThumbnailImageUrls = null;
        java.lang.String itemViewModelPrice = null;
        com.dubizzle.products.listeners.ProductClickListener listener = mListener;
        java.lang.String itemViewModelName = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.thumbnailImageUrls
                    itemViewModelThumbnailImageUrls = itemViewModel.getThumbnailImageUrls();
                    // read itemViewModel.price
                    itemViewModelPrice = itemViewModel.getPrice();
                    // read itemViewModel.name
                    itemViewModelName = itemViewModel.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.dubizzle.products.common.BindingAdpaters.loadImageUrl(this.ivLogo, itemViewModelThumbnailImageUrls);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, itemViewModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, itemViewModelPrice);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        com.dubizzle.domain.entity.response.products.ProductsEntity.Product itemViewModel = mItemViewModel;
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        com.dubizzle.products.listeners.ProductClickListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {



            listener.select(itemViewModel);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}