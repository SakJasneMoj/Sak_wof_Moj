package sk.uniza.fri.items;

import sk.uniza.fri.player.Player;

public interface IGear {

    void equip(Player player);

    void unEquip(Player player);

    String getPosition();
}
