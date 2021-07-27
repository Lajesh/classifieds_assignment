package com.dubizzle.products.databinding;
import com.dubizzle.products.R;
import com.dubizzle.products.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductDetailsBindingImpl extends FragmentProductDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nestedScroll, 6);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentProductDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (androidx.core.widget.NestedScrollView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        this.ivDetailLogo.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCreatedDate.setTag(null);
        this.tvDetailName.setTag(null);
        this.tvDetailPrice.setTag(null);
        this.tvUid.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.dubizzle.products.view.fragment.products.ProductDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.dubizzle.products.view.fragment.products.ProductDetailsViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.dubizzle.products.view.fragment.products.ProductDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.dubizzle.products.view.fragment.products.ProductDetailsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.util.Date viewModelSharedViewModelProductCreatedAt = null;
        java.lang.String viewModelSharedViewModelProductUid = null;
        java.util.List<java.lang.String> viewModelSharedViewModelProductImageURLs = null;
        java.lang.String viewModelSharedViewModelProductName = null;
        com.dubizzle.core.viewmodel.SharedViewModel viewModelSharedViewModel = null;
        com.dubizzle.products.view.fragment.products.ProductDetailsViewModel viewModel = mViewModel;
        com.dubizzle.domain.entity.response.products.ProductsEntity.Product viewModelSharedViewModelProduct = null;
        java.lang.String viewModelSharedViewModelProductPrice = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.sharedViewModel
                    viewModelSharedViewModel = viewModel.getSharedViewModel();
                }


                if (viewModelSharedViewModel != null) {
                    // read viewModel.sharedViewModel.product
                    viewModelSharedViewModelProduct = viewModelSharedViewModel.getProduct();
                }


                if (viewModelSharedViewModelProduct != null) {
                    // read viewModel.sharedViewModel.product.createdAt
                    viewModelSharedViewModelProductCreatedAt = viewModelSharedViewModelProduct.getCreatedAt();
                    // read viewModel.sharedViewModel.product.uid
                    viewModelSharedViewModelProductUid = viewModelSharedViewModelProduct.getUid();
                    // read viewModel.sharedViewModel.product.imageURLs
                    viewModelSharedViewModelProductImageURLs = viewModelSharedViewModelProduct.getImageURLs();
                    // read viewModel.sharedViewModel.product.name
                    viewModelSharedViewModelProductName = viewModelSharedViewModelProduct.getName();
                    // read viewModel.sharedViewModel.product.price
                    viewModelSharedViewModelProductPrice = viewModelSharedViewModelProduct.getPrice();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.dubizzle.products.common.BindingAdpaters.loadImageUrl(this.ivDetailLogo, viewModelSharedViewModelProductImageURLs);
            com.dubizzle.products.common.BindingAdpaters.formatReleaseDate(this.tvCreatedDate, viewModelSharedViewModelProductCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDetailName, viewModelSharedViewModelProductName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDetailPrice, viewModelSharedViewModelProductPrice);
            com.dubizzle.products.common.BindingAdpaters.formatCreatedDate(this.tvUid, viewModelSharedViewModelProductUid);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}