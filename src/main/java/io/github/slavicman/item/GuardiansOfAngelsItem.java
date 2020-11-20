
package io.github.slavicman.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import io.github.slavicman.NirvoMusicDiscModElements;

@NirvoMusicDiscModElements.ModElement.Tag
public class GuardiansOfAngelsItem extends NirvoMusicDiscModElements.ModElement {
	@ObjectHolder("nirvo_music_disc:guardians_of_angels")
	public static final Item block = null;
	public GuardiansOfAngelsItem(NirvoMusicDiscModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, NirvoMusicDiscModElements.sounds.get(new ResourceLocation("nirvo_music_disc:nirvo_guardiansofangels")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("guardians_of_angels");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
