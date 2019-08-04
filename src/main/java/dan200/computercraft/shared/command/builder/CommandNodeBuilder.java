/*
 * This file is part of ComputerCraft - http://www.computercraft.info
 * Copyright Daniel Ratcliffe, 2011-2019. Do not distribute without permission.
 * Send enquiries to dratcliffe@gmail.com
 */

package dan200.computercraft.shared.command.builder;

import com.mojang.brigadier.tree.CommandNode;

/**
 * A builder which generates a {@link CommandNode} from the provided action.
 */
@FunctionalInterface
public interface CommandNodeBuilder<S, T>
{
    /**
     * Generate a command node which executes this command.
     *
     * @param command The command to run
     * @return The constructed node.
     */
    CommandNode<S> executes( T command );
}