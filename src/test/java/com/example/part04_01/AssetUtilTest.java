package com.example.part04_01;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.example.part04_01.Asset.AssetType;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AssetUtilTest {
    List<Asset> assets;

    @Before
    public void setUpt() {
        assets = Arrays.asList(new Asset(Asset.AssetType.BOND, 1000),
                new Asset(Asset.AssetType.BOND, 2000),
                new Asset(Asset.AssetType.STOCK, 3000),
                new Asset(Asset.AssetType.STOCK, 4000));
    }

    @Test
    public void 合計() {
        assertThat(AssetUtil.totalAssetValues(assets), is(10000));
        assertThat(AssetUtil.totalAssetValues(assets, asset -> true),
                is(10000));
    }

    @Test
    public void BONDだけ合計() {
        assertThat(AssetUtil.totalBondValues(assets), is(3000));
        assertThat(AssetUtil.totalAssetValues(assets,
                asset -> asset.getType() == AssetType.BOND), is(3000));
    }

    @Test
    public void STOCKだけ合計() {
        assertThat(AssetUtil.totalStockValues(assets), is(7000));
        assertThat(AssetUtil.totalAssetValues(assets,
                asset -> asset.getType() == AssetType.STOCK), is(7000));
    }
}
